/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.shimanski.eufe;

public class ResistancesLayer {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ResistancesLayer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ResistancesLayer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        eufeJNI.delete_ResistancesLayer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setEm(float value) {
    eufeJNI.ResistancesLayer_em_set(swigCPtr, this, value);
  }

  public float getEm() {
    return eufeJNI.ResistancesLayer_em_get(swigCPtr, this);
  }

  public void setExplosive(float value) {
    eufeJNI.ResistancesLayer_explosive_set(swigCPtr, this, value);
  }

  public float getExplosive() {
    return eufeJNI.ResistancesLayer_explosive_get(swigCPtr, this);
  }

  public void setKinetic(float value) {
    eufeJNI.ResistancesLayer_kinetic_set(swigCPtr, this, value);
  }

  public float getKinetic() {
    return eufeJNI.ResistancesLayer_kinetic_get(swigCPtr, this);
  }

  public void setThermal(float value) {
    eufeJNI.ResistancesLayer_thermal_set(swigCPtr, this, value);
  }

  public float getThermal() {
    return eufeJNI.ResistancesLayer_thermal_get(swigCPtr, this);
  }

  public ResistancesLayer() {
    this(eufeJNI.new_ResistancesLayer(), true);
  }

}
