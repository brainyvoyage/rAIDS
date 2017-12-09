package com.raids.ds.core.graph.edge

trait Unweighted extends Weight[Unweighted]{
  val _weight:Float = 1.0f
  def weight: Float = _weight
  override def toString: String = new String(Array[Byte](0xE2.toByte, 0x80.toByte, 0x95.toByte))
}
