package com.raids.ds.core.graph

package object edge {
  sealed trait Direction[T <: Direction[T]]
  sealed trait Weight[T <: Weight[T]]

  trait Directed extends Direction[Directed] {
    override def toString: String = new String(Array[Byte](0xE2.toByte, 0xAE.toByte, 0x9E.toByte))
  }

  trait Undirected extends Direction[Undirected]{
    override def toString: String = ""
  }

  trait Weighted extends Weight[Weighted]{
    private var _weight: Float = 0.0f
    def * (multiplier: Float): Unit = _weight *= multiplier
    def + (increment: Float): Unit = _weight += increment
    def - (increment: Float): Unit = _weight -= increment
    def weight: Float = _weight
    def weight_= (value: Float): Unit = _weight = value

    override def toString: String = new String(Array[Byte](0xE2.toByte, 0x94.toByte, 0x81.toByte))
  }

  trait Unweighted extends Weight[Unweighted]{
    val _weight:Float = 1.0f
    def weight: Float = _weight
    override def toString: String = new String(Array[Byte](0xE2.toByte, 0x80.toByte, 0x95.toByte))
  }
}
