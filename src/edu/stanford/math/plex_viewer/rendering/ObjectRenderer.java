package edu.stanford.math.plex_viewer.rendering;

import java.awt.event.KeyEvent;

import javax.media.opengl.GL;

/**
 * This interface defines the functionality for a class that produces an OpenGL
 * rendering of an object.
 * 
 * @author Andrew Tausz
 *
 */
public interface ObjectRenderer {
	/**
	 * This function initializes the renderer.
	 * 
	 * @param gl the OpenGl object
	 */
	void init(GL gl);
	
	/**
	 * This function renders the supplied shape.
	 * 
	 * @param gl the OpenGl object
	 */
	void renderShape(GL gl);
	
	/**
	 * This function performs any further processing of key events
	 * not handled by the standard key handler.
	 * 
	 * @param e
	 */
	void processSpecializedKeys(KeyEvent e);
}
