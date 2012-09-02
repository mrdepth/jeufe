/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.shimanski.eufe;

public class Item {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Item(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Item obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        eufeJNI.delete_Item(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Engine getEngine() {
    long cPtr = eufeJNI.Item_getEngine(swigCPtr, this);
    return (cPtr == 0) ? null : new Engine(cPtr, false);
  }

  public Item getOwner() {
    long cPtr = eufeJNI.Item_getOwner(swigCPtr, this);
    return (cPtr == 0) ? null : new Item(cPtr, false);
  }

  public void setOwner(Item owner) {
    eufeJNI.Item_setOwner(swigCPtr, this, Item.getCPtr(owner), owner);
  }

  public int getTypeID() {
    return eufeJNI.Item_getTypeID(swigCPtr, this);
  }

  public int getGroupID() {
    return eufeJNI.Item_getGroupID(swigCPtr, this);
  }

  public int getCategoryID() {
    return eufeJNI.Item_getCategoryID(swigCPtr, this);
  }

  public Attribute getAttribute(int attributeID) {
    long cPtr = eufeJNI.Item_getAttribute(swigCPtr, this, attributeID);
    return (cPtr == 0) ? null : new Attribute(cPtr, false);
  }

  public AttributesMap getAttributes() {
    return new AttributesMap(eufeJNI.Item_getAttributes(swigCPtr, this), false);
  }

  public boolean hasAttribute(int attributeID) {
    return eufeJNI.Item_hasAttribute(swigCPtr, this, attributeID);
  }

  public Effect getEffect(int effectID) {
    long cPtr = eufeJNI.Item_getEffect(swigCPtr, this, effectID);
    return (cPtr == 0) ? null : new Effect(cPtr, false);
  }

  public boolean requireSkill(int skillID) {
    return eufeJNI.Item_requireSkill(swigCPtr, this, skillID);
  }

  public boolean hasEffect(int effectID) {
    return eufeJNI.Item_hasEffect(swigCPtr, this, effectID);
  }

  public String getTypeName() {
    return eufeJNI.Item_getTypeName(swigCPtr, this);
  }

}