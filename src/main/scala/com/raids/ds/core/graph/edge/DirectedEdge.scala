package com.raids.ds.core.graph.edge

import com.raids.ds.core.graph.Vertex

class DirectedEdge[T](val vertex1: Vertex[T], val vertex2: Vertex[T]) extends Edge[T] with Directed with Unweighted{
  override def toString: String = vertex1.toString +
    super[Unweighted].toString +
    super[Directed].toString +
    vertex2.toString
}
