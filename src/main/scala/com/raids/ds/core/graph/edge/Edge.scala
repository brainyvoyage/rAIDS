package com.raids.ds.core.graph.edge

import com.raids.ds.core.graph.Vertex

abstract class Edge[T]{
  self: Direction[_] with Weight[_] =>
//  require(vertex1 != vertex2)
  val vertex1:Vertex[T]
  val vertex2:Vertex[T]
}