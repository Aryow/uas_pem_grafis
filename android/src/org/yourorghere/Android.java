package org.yourorghere;

import com.sun.opengl.util.Animator;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;

/**
 * Android.java <BR>
 * author: Brian Paul (converted to Java by Ron Cemer and Sven Goethel)
 * <P>
 *
 * This version is equal to Brian Paul's version 1.2 1999/10/21
 */
public class Android implements GLEventListener {
    float angle = 0;

    public static void main(String[] args) {
        Frame frame = new Frame("Tugas 4 - Logo Android");
        GLCanvas canvas = new GLCanvas();

        canvas.addGLEventListener(new Android());
        frame.add(canvas);
        frame.setSize(640, 480);
        final Animator animator = new Animator(canvas);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                new Thread(new Runnable() {
                    public void run() {
                        animator.stop();
                        System.exit(0);
                    }
                }).start();
            }
        });
// Center frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        animator.start();
    }
    private float view_rotx = 20.0f;
    private float view_roty = 30.0f;
    private int oldMouseX;
    private int oldMouseY;

    public void init(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();
        gl.glClearColor(1.0f, 1.0f, 1.0f, 0.0f);
        gl.glShadeModel(GL.GL_FLAT);
        float ambient[] = {1.0f, 1.0f, 1.0f, 1.0f};
        float difusse[] = {1.0f, 1.0f, 1.0f, 1.0f};
        float specular[] = {0.2f, 1.0f, 0.2f, 1.0f};
        float position[] = {20.0f, 30.0f, 20.0f, 0.0f};
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_AMBIENT, ambient, 0);
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_DIFFUSE, difusse, 0);
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_POSITION, position, 0);
        gl.glMaterialfv(GL.GL_FRONT, GL.GL_SPECULAR, specular, 0);
        float[] mambient = {0.2f, 1.01175f, 0.2f, 0f
        };
        float[] mdiffuse = {0.61424f, 0.04136f, 0.04136f, 0.55f};
        float[] mspecular = {0.727811f, 0.626959f, 0.626959f, 0.55f};
        float mshine = 76.8f;
        gl.glMaterialfv(GL.GL_FRONT, GL.GL_AMBIENT, mambient, 0);
        gl.glMaterialfv(GL.GL_FRONT, GL.GL_DIFFUSE, mdiffuse, 0);
        gl.glMaterialfv(GL.GL_FRONT, GL.GL_SPECULAR, mspecular, 0);
        gl.glMaterialf(GL.GL_FRONT, GL.GL_SHININESS, mshine);
        gl.glEnable(GL.GL_LIGHTING);
        gl.glEnable(GL.GL_LIGHT0);
        gl.glEnable(GL.GL_DEPTH_TEST);
        gl.glEnable(GL.GL_NORMALIZE);
//        drawable.addMouseListener(this);
//        drawable.addMouseMotionListener(this);
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();
        if (height <= 0) {
            height = 1;
        }
        final float h = (float) width / (float) height;
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(45.0f, h, 1.0, 20.0);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
    }

    public void display(GLAutoDrawable drawable) {
        angle += 10;
        GL gl = drawable.getGL();
        GLU glu = new GLU();
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        gl.glLoadIdentity();
        glu.gluLookAt(4, 4, 4, // eye pos
                0, 0, 0, // look at
                0, 0, 1); // up
        gl.glTranslatef(0f, 0f, 0f);
//        gl.glRotatef(angle, 1.0f, 0.0f, 0.0f);
//        
        //gl.glTranslatef(-0.5f, 2.5f, -1.5f);
// Objek kepala
        gl.glTranslatef(-5.5f, -5.5f, -1.5f);
         gl.glRotatef(180, 0.0f, 10.0f, 0.0f);
        gl.glPushMatrix();
        
        Objek.Setengah(gl); // Pada fungsi yang sudah dibuat pada pembahasan sebelumnya
        gl.glPopMatrix();
// Objek Bola
        gl.glTranslatef(1.0f, 1.0f, 1.0f);
        gl.glPushMatrix();
        Objek.Tabung3(gl); // Pada fungsi yang sudah dibuat pada pembahasan sebelumnya

        gl.glPopMatrix();

        gl.glTranslatef(-1f, -2.5f, 0f);
        gl.glPushMatrix();
        Objek.Tabung3(gl); // Pada fungsi yang sudah dibuat pada pembahasan sebelumnya

        gl.glPopMatrix();
        gl.glFlush();

        gl.glTranslatef(0f, 0f, 0f);
        gl.glPushMatrix();
        Objek.Bola2(gl); // Pada fungsi yang sudah dibuat pada pembahasan sebelumnya

        gl.glPopMatrix();

        gl.glTranslatef(0f, 0f, 2.5f);
//gl.glPushMatrix();
//Bola.Bola2(gl); // Pada fungsi yang sudah dibuat pada pembahasan sebelumnya
//
////gl.glPopMatrix();
//
//        gl.glTranslatef(1f, 2.5f, 0f);
////gl.glPushMatrix();
////Bola.Bola2(gl); // Pada fungsi yang sudah dibuat pada pembahasan sebelumnya
////
////gl.glPopMatrix();
//
//        gl.glTranslatef(0f, 3.5f, -2.5f);
//        gl.glPushMatrix();
//        Objek.Bola2(gl); // Pada fungsi yang sudah dibuat pada pembahasan sebelumnya
//
//        gl.glPopMatrix();
//        gl.glFlush();

        gl.glTranslatef(0f, 1.5f, -3f);
         
        gl.glPushMatrix();
        Objek.Tabung1(gl); // Pada fungsi yang sudah dibuat pada pembahasan sebelumnya

        gl.glPopMatrix();
        gl.glFlush();

        gl.glTranslatef(0f, 0.5f, 1f);
        gl.glPushMatrix();
        Objek.Tabung2(gl); // Pada fungsi yang sudah dibuat pada pembahasan sebelumnya

        gl.glPopMatrix();
        gl.glFlush();

        gl.glTranslatef(0f, 0f, 2.6f);
        gl.glPushMatrix();
        Objek.Bola2(gl); // Pada fungsi yang sudah dibuat pada pembahasan sebelumnya

        gl.glPopMatrix();
        gl.glFlush();

        gl.glTranslatef(0f, -1f, -2.7f);
        gl.glPushMatrix();
        Objek.Tabung2(gl); // Pada fungsi yang sudah dibuat pada pembahasan sebelumnya

        gl.glPopMatrix();
        gl.glFlush();

        gl.glTranslatef(0f, 0f, 2.5f);
        gl.glPushMatrix();
        Objek.Bola2(gl); // Pada fungsi yang sudah dibuat pada pembahasan sebelumnya

        gl.glPopMatrix();
        gl.glFlush();
//
//        gl.glTranslatef(0f, -0.9f, -1.4f);
//        gl.glPushMatrix();
//        Objek.Bola2(gl); // Pada fungsi yang sudah dibuat pada pembahasan sebelumnya
//
//        gl.glPopMatrix();
//        gl.glFlush();
//
//        gl.glTranslatef(1f, -0.5f, 0f);
//        gl.glPushMatrix();
//        Objek.Bola2(gl); // Pada fungsi yang sudah dibuat pada pembahasan sebelumnya
//
//        gl.glPopMatrix();
//        gl.glFlush();
//
//        gl.glTranslatef(-0.2f, -0.5f, -0.8f);
//        gl.glPushMatrix();
//        Objek.Tabung4(gl); // Pada fungsi yang sudah dibuat pada pembahasan sebelumnya
//
//        gl.glPopMatrix();
//        gl.glFlush();
//
//        gl.glTranslatef(-0.6f, -1.7f, 0f);
//        gl.glPushMatrix();
//        Objek.Tabung4(gl); // Pada fungsi yang sudah dibuat pada pembahasan sebelumnya
//
//        gl.glPopMatrix();
//        gl.glFlush();

    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
        oldMouseX = e.getX();
        oldMouseY = e.getY();
    }

//    public void mouseDragged(MouseEvent e) {
//        int x = e.getX();
//        int y = e.getY();
//        Dimension size = e.getComponent().getSize();
//        float thetaY = 360.0f * ((float) (x - oldMouseX) / (float) size.width);
//        float thetaX = 360.0f * ((float) (oldMouseY - y) / (float) size.height);
//        oldMouseX = x;
//        oldMouseY = y;
//        view_rotx += thetaX;
//        view_roty += thetaY;
}

    
