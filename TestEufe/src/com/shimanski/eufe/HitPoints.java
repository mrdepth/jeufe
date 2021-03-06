/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.shimanski.eufe;

public class HitPoints {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected HitPoints(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(HitPoints obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        eufeJNI.delete_HitPoints(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setArmor(float value) {
    eufeJNI.HitPoints_armor_set(swigCPtr, this, value);
  }

  public float getArmor() {
    return eufeJNI.HitPoints_armor_get(swigCPtr, this);
  }

  public void setHull(float value) {
    eufeJNI.HitPoints_hull_set(swigCPtr, this, value);
  }

  public float getHull() {
    return eufeJNI.HitPoints_hull_get(swigCPtr, this);
  }

  public void setShield(float value) {
    eufeJNI.HitPoints_shield_set(swigCPtr, this, value);
  }

  public float getShield() {
    return eufeJNI.HitPoints_shield_get(swigCPtr, this);
  }

  public HitPoints() {
    this(eufeJNI.new_HitPoints(), true);
  }

}
