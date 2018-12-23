/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class LocalConvexResult extends BulletBase {
	private long swigCPtr;
	
	protected LocalConvexResult(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new LocalConvexResult, normally you should not need this constructor it's intended for low-level usage. */ 
	public LocalConvexResult(long cPtr, boolean cMemoryOwn) {
		this("LocalConvexResult", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(LocalConvexResult obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_LocalConvexResult(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public LocalConvexResult(btCollisionObject hitCollisionObject, LocalShapeInfo localShapeInfo, Vector3 hitNormalLocal, Vector3 hitPointLocal, float hitFraction) {
    this(CollisionJNI.new_LocalConvexResult(btCollisionObject.getCPtr(hitCollisionObject), hitCollisionObject, LocalShapeInfo.getCPtr(localShapeInfo), localShapeInfo, hitNormalLocal, hitPointLocal, hitFraction), true);
  }

  public void setHitCollisionObject(btCollisionObject value) {
    CollisionJNI.LocalConvexResult_hitCollisionObject_set(swigCPtr, this, btCollisionObject.getCPtr(value), value);
  }

  public btCollisionObject getHitCollisionObject() {
	return btCollisionObject.getInstance(CollisionJNI.LocalConvexResult_hitCollisionObject_get(swigCPtr, this), false);
}

  public void setLocalShapeInfo(LocalShapeInfo value) {
    CollisionJNI.LocalConvexResult_localShapeInfo_set(swigCPtr, this, LocalShapeInfo.getCPtr(value), value);
  }

  public LocalShapeInfo getLocalShapeInfo() {
    long cPtr = CollisionJNI.LocalConvexResult_localShapeInfo_get(swigCPtr, this);
    return (cPtr == 0) ? null : new LocalShapeInfo(cPtr, false);
  }

  public void setHitFraction(float value) {
    CollisionJNI.LocalConvexResult_hitFraction_set(swigCPtr, this, value);
  }

  public float getHitFraction() {
    return CollisionJNI.LocalConvexResult_hitFraction_get(swigCPtr, this);
  }

  public void getHitNormalLocal(Vector3 out) {
    CollisionJNI.LocalConvexResult_getHitNormalLocal(swigCPtr, this, out);
  }

  public void setHitNormalLocal(Vector3 value) {
    CollisionJNI.LocalConvexResult_setHitNormalLocal(swigCPtr, this, value);
  }

  public void getHitPointLocal(Vector3 out) {
    CollisionJNI.LocalConvexResult_getHitPointLocal(swigCPtr, this, out);
  }

  public void setHitPointLocal(Vector3 value) {
    CollisionJNI.LocalConvexResult_setHitPointLocal(swigCPtr, this, value);
  }

}
