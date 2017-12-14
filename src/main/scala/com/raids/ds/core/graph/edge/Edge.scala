package com.raids.ds.core.graph.edge

import com.raids.Data
import com.raids.ds.core.graph.Vertex

abstract class Edge[A]{
  self: Direction[_] with Weight[_] =>
//  require(vertex1 != vertex2)
  val vertex1:Vertex[Data[_]]
  val vertex2:Vertex[Data[_]]
}