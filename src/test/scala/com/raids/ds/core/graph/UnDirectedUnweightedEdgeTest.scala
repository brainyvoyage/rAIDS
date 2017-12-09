package com.raids.ds.core.graph

import org.scalatest.FunSuite

class UnDirectedUnweightedEdgeTest extends FunSuite {
  val node1 = new Node[String](value = "node1", source = true)
  val node2 = new Node[String](value = "node2", source = false)
  val edge1 = new UnDirectedUnweightedEdge[String](n1 = node1, n2 = node2)
  val edgeString = node1.toString + new String(Array[Byte](0xE2.toByte, 0x80.toByte, 0x95.toByte)) + node2.toString

  test("testWeight") {
    assert(edge1.weight == 1.0f)
  }

  test("testToString") {
    assert(edgeString == edge1.toString)
  }
}
