package com.raids.ds.core.graph.edge

import com.raids.ds.core.graph.Vertex

class WeightedDirectedEdge[T](val vertex1: Vertex[T], val vertex2: Vertex[T]) extends Edge[T] with Weighted with Directed{
  override def toString: String = vertex1.toString +
    super[Weighted].toString +
    super[Directed].toString +
    vertex2.toString
}
