package com.raids.ds.core.graph.edge

abstract class Edge[T]{
  self: Direction[_] with Weight[_] =>
  val vertex1:T
  val vertex2:T
}