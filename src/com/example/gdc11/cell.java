package com.example.gdc11;

import android.opengl.*;

public class cell{
  private float pos[]=new float[4];
  public void Render(){
GLfloat vertices[] = {1,0,0, 0,1,0, -1,0,0};
glEnableClientState(GL_VERTEX_ARRAY);
glVertexPointer(3, GL_FLOAT, 0, vertices);
glDrawArrays(GL_TRIANGLES, 0, 3);
glDisableClientState(GL_VERTEX_ARRAY);
  }
  public cell(float p[]){
    pos[0]=p[0];
    pos[1]=p[1];
    pos[2]=p[2];
  //  pos[3]=p[3];

    float triangleCoords[] = {
        // X, Y, Z
        -0.5f, -0.25f, 0,
         0.5f, -0.25f, 0,
         0.0f,  0.559016994f, 0,
         0.0f,  0f, 0
    }; 

    // initialize vertex Buffer for triangle  
    ByteBuffer vbb = ByteBuffer.allocateDirect(
            // (# of coordinate values * 4 bytes per float)
            triangleCoords.length * 4); 
    vbb.order(ByteOrder.nativeOrder());// use the device hardware's native byte order
    triangleVB = vbb.asFloatBuffer();  // create a floating point buffer from the ByteBuffer
    triangleVB.put(triangleCoords);    // add the coordinates to the FloatBuffer
    triangleVB.position(0);   
  }
}
