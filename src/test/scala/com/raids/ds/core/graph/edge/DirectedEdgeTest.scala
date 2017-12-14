package com.raids.ds.core.graph.edge

import com.raids.Data
import com.raids.ds.core.graph.Vertex
import org.scalatest.{FlatSpec, Matchers}

class DirectedEdgeTest extends FlatSpec with Matchers {
  val v1 = new Vertex[Int](new Data[Int](3))
  val v2 = new Vertex[Int](new Data[Int](4))
  val e1:DirectedEdge[Int] = new DirectedEdge[Int](3,4)

  "An edge initialised with float type vertex" should
  "have double type vertex " in {
    val data = e1.vertex1.data
    data.data.isInstanceOf[Int] should be  (true)
  }
}
