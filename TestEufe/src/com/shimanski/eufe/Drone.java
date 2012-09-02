/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.shimanski.eufe;

public class Drone extends Item {
  private long swigCPtr;

  protected Drone(long cPtr, boolean cMemoryOwn) {
    super(eufeJNI.Drone_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Drone obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        eufeJNI.delete_Drone(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setTarget(Ship target) {
    eufeJNI.Drone_setTarget__SWIG_0(swigCPtr, this, Ship.getCPtr(target), target);
  }

  public void setTarget() {
    eufeJNI.Drone_setTarget__SWIG_1(swigCPtr, this);
  }

  public void clearTarget() {
    eufeJNI.Drone_clearTarget(swigCPtr, this);
  }

  public Ship getTarget() {
    long cPtr = eufeJNI.Drone_getTarget(swigCPtr, this);
    return (cPtr == 0) ? null : new Ship(cPtr, false);
  }

  public boolean dealsDamage() {
    return eufeJNI.Drone_dealsDamage(swigCPtr, this);
  }

  public SWIGTYPE_p_eufe__Charge getCharge() {
    long cPtr = eufeJNI.Drone_getCharge(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_eufe__Charge(cPtr, false);
  }

  public void setActive(boolean active) {
    eufeJNI.Drone_setActive(swigCPtr, this, active);
  }

  public boolean isActive() {
    return eufeJNI.Drone_isActive(swigCPtr, this);
  }

  public float getCycleTime() {
    return eufeJNI.Drone_getCycleTime(swigCPtr, this);
  }

  public float getVolley() {
    return eufeJNI.Drone_getVolley(swigCPtr, this);
  }

  public float getDps() {
    return eufeJNI.Drone_getDps(swigCPtr, this);
  }

  public float getMaxRange() {
    return eufeJNI.Drone_getMaxRange(swigCPtr, this);
  }

  public float getFalloff() {
    return eufeJNI.Drone_getFalloff(swigCPtr, this);
  }

  public float getTrackingSpeed() {
    return eufeJNI.Drone_getTrackingSpeed(swigCPtr, this);
  }

}