package com.raids.ds.core.graph

import org.scalatest.FunSuite

class UnDirectedWeightedEdgeTest extends FunSuite {
  val node1 = new Node[String](value = "node1", source = true)
  val node2 = new Node[String](value = "node2", source = false)
  val edge1 = new UnDirectedWeightedEdge[String](n1 = node1, n2 = node2)


  test("testWeight") {
    val weight = edge1.weight
    assert(weight == 0.0f)

    edge1.weight = 2.0f
    val result = edge1.weight
    assert(result == 2.0f)
  }

  test("test$times") {
    edge1.weight *= 3.0f
    assert(edge1.weight == 6.0f)
  }

  test("test$plus") {
    edge1.weight += 2.3f
    assert(edge1.weight == 8.3f)
  }

  test("testToString") {
    val result = edge1.toString
    val expected = node1.toString +
      new String(Array[Byte](0xE2.toByte, 0x94.toByte, 0x81.toByte)) +
      node2.toString
    assert(result == expected)
  }

  test("testWeight_$eq") {
    edge1.weight = 2.345f
    assert(edge1.weight == 2.345f)
  }

}
