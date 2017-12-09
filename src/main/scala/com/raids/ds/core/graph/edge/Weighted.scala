package com.raids.ds.core.graph.edge

trait Weighted extends Weight[Weighted]{
  private var _weight: Float = 0.0f
  def * (multiplier: Float): Unit = _weight *= multiplier
  def + (increment: Float): Unit = _weight += increment
  def - (increment: Float): Unit = _weight -= increment
  def weight: Float = _weight
  def weight_= (value: Float): Unit = _weight = value

  override def toString: String = new String(Array[Byte](0xE2.toByte, 0x94.toByte, 0x81.toByte))
}
