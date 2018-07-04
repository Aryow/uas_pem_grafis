package org.yourorghere;

import com.sun.opengl.util.GLUT;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

public class Objek {

    static void Badan(GL gl) {
        {

            float BODY_RADIUS = 0.5f * 2;
            float BODY_LENGTH = 0.5f * 5;
            int SLICES = 40;
            int STACKS = 40;
            GLU glu = new GLU();
            GLUquadric q = glu.gluNewQuadric();
            glu.gluCylinder(q, BODY_RADIUS, BODY_RADIUS, BODY_LENGTH, SLICES, STACKS);
            glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS); //lingkaran untuk tutup atas
            gl.glTranslatef(0f, 0.0f, BODY_LENGTH);
            glu.gluDisk(q, 0f, BODY_RADIUS, SLICES, STACKS); //lingkaran untuk tutup bawah
        }
    }

    static void Kepala(GL gl) {
        double clip_plane1[] = {0.0, 0.0, -10.0, 2};
        gl.glClipPlane(GL.GL_CLIP_PLANE1, clip_plane1, 0);
        gl.glEnable(GL.GL_CLIP_PLANE1);
// drawing a sphere
        GLU glu = new GLU();
        GLUquadric qd = glu.gluNewQuadric();
        glu.gluSphere(qd, 1.0f, 30, 30);
        glu.gluDisk(qd, 1f, 0f, 20, 20);
        glu.gluDeleteQuadric(qd);
        gl.glDisable(GL.GL_CLIP_PLANE1);
    }
}
