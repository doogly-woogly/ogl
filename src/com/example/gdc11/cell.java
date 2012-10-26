package com.example.gdc11;

import android.opengl.*;

public class cell{
  private float pos[]=new float[4];

// New class members
/** Store our model data in a float buffer. */
private final FloatBuffer mTriangle1Vertices;
private final FloatBuffer mTriangle2Vertices;
private final FloatBuffer mTriangle3Vertices;
 
/** How many bytes per float. */
private final int mBytesPerFloat = 4;
 

  public void Render(){
  }
  public cell(float p[]){
    pos[0]=p[0];
    pos[1]=p[1];
    pos[2]=p[2];
  //  pos[3]=p[3];

    // This triangle is red, green, and blue.
    final float[] triangle1VerticesData = {
            // X, Y, Z,
            // R, G, B, A
            -0.5f, -0.25f, 0.0f,
            1.0f, 0.0f, 0.0f, 1.0f,
 
            0.5f, -0.25f, 0.0f,
            0.0f, 0.0f, 1.0f, 1.0f,
 
            0.0f, 0.559016994f, 0.0f,
            0.0f, 1.0f, 0.0f, 1.0f};
 
 
    // Initialize the buffers.
    mTriangle1Vertices = ByteBuffer.allocateDirect(triangle1VerticesData.length * mBytesPerFloat)
    .order(ByteOrder.nativeOrder()).asFloatBuffer();
 
 
    mTriangle1Vertices.put(triangle1VerticesData).position(0);

  }
}
