/**
 * This code is copyright (c) Mathias Markl 2016
 *
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 2 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */

package at.mukprojects.imageloader.file;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import at.mukprojects.imageloader.ImageLoader;
import at.mukprojects.imageloader.image.ImageList;
import processing.core.PApplet;

/**
 * This class represents the FileLoader.
 * 
 * @author Mathias Markl
 */
public class FileLoader extends ImageLoader {

    private static final Logger logger = LoggerFactory.getLogger(FileLoader.class);

    private Thread thread = null;
    private FileTask runnable = null;

    /**
     * Constructs a new ImageLoader.
     */
    public FileLoader(PApplet applet) {
	super(applet);
    }

    @Override
    public ImageList start(String searchParam, ImageList imageList, boolean runOnce, long delay) {
	if (thread != null) {
	    logger.info("Loader is already started.");
	    logger.info("The restart method will be used instead.");

	    return restart(searchParam, imageList, runOnce, delay);
	} else {
	    runnable = new FileTask(applet, searchParam, imageList, runOnce, delay);
	    thread = new Thread(runnable, "FlickrTask");

	    logger.info("Starting Thread: " + thread + "...");
	    thread.start();
	    logger.debug(thread + " successfully started.");

	    return imageList;
	}
    }

    @Override
    public ImageList restart(String searchParam, ImageList imageList, boolean runOnce, long delay) {
	logger.info("Stopping the current thread: " + thread + "...");
	runnable.stop();
	logger.debug(thread + " successfully stopped.");

	runnable = new FileTask(applet, searchParam, imageList, runOnce, delay);
	thread = new Thread(runnable, "FlickrTask");

	logger.info("Starting Thread: " + thread + "...");
	thread.start();
	logger.debug(thread + " successfully started.");

	return imageList;
    }

    @Override
    public void stop() {
	logger.info("Stopping the current thread: " + thread + "...");

	runnable.stop();
	thread = null;
	runnable = null;

	logger.debug(thread + " successfully stopped.");
    }
}
