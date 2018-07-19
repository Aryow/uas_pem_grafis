package org.yourorghere;

import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;


public class Objek {

    static void kepala(GL gl) {
        float BODY_RADIUS = 2f;
        int SLICES = 100;
        int STACKS = 100;
        GLU glu = new GLU();
        GLUquadric q = glu.gluNewQuadric();
        glu.gluSphere(q, BODY_RADIUS, SLICES, STACKS);
    }
    
    static void tangankanan(GL gl) {
        gl.glBegin(GL.GL_POLYGON);//kiri            
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 0, 0);//1
        gl.glVertex3f(0, 1, 0);//2
        gl.glVertex3f(0, 1, 3);//3
        gl.glVertex3f(0, 0, 3);//4
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//atas
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 0, 0);//1
        gl.glVertex3f(1, 0, 0);//5
        gl.glVertex3f(1, 1, 0);//6
        gl.glVertex3f(0, 1, 0);//2
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//belakang
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 0, 0);//1
        gl.glVertex3f(0, 0, 3);//4
        gl.glVertex3f(1, 0, 3);//8
        gl.glVertex3f(1, 0, 0);//5
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//depan
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 1, 0);//2
        gl.glVertex3f(1, 1, 0);//6
        gl.glVertex3f(1, 1, 3);//7
        gl.glVertex3f(0, 1, 3);//3
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//kanan
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(1, 0, 0);//5
        gl.glVertex3f(1, 1, 0);//6
        gl.glVertex3f(1, 1, 3);//7
        gl.glVertex3f(1, 0, 3);//8
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//bawah
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(1, 1, 3);//7
        gl.glVertex3f(1, 0, 3);//8
        gl.glVertex3f(0, 0, 3);//4
        gl.glVertex3f(0, 1, 3);//3
        gl.glEnd();
    }

    static void tangankiri(GL gl) {
        gl.glBegin(GL.GL_POLYGON);//kiri
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 0, 0);//1
        gl.glVertex3f(0, 1, 0);//2
        gl.glVertex3f(0, 1, 3);//3
        gl.glVertex3f(0, 0, 3);//4
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//atas
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 0, 0);//1
        gl.glVertex3f(1, 0, 0);//5
        gl.glVertex3f(1, 1, 0);//6
        gl.glVertex3f(0, 1, 0);//2
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//belakang
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 0, 0);//1
        gl.glVertex3f(0, 0, 3);//4
        gl.glVertex3f(1, 0, 3);//8
        gl.glVertex3f(1, 0, 0);//5
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//depan
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 1, 0);//2
        gl.glVertex3f(1, 1, 0);//6
        gl.glVertex3f(1, 1, 3);//7
        gl.glVertex3f(0, 1, 3);//3
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//kanan
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(1, 0, 0);//5
        gl.glVertex3f(1, 1, 0);//6
        gl.glVertex3f(1, 1, 3);//7
        gl.glVertex3f(1, 0, 3);//8
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//bawah
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(1, 1, 3);//7
        gl.glVertex3f(1, 0, 3);//8
        gl.glVertex3f(0, 0, 3);//4
        gl.glVertex3f(0, 1, 3);//3
        gl.glEnd();
    }
}
