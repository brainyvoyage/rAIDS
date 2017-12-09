package com.raids.ds.core.graph.edge

trait Directed extends Direction[Directed] {
  override def toString: String = new String(Array[Byte](0xE2.toByte, 0xAE.toByte, 0x9E.toByte))
}
