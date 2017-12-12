package com.raids.ds.core.graph.edge

import com.raids.ds.core.graph.Vertex

class WeightedUndirectedEdge[T](val vertex1:Vertex[T], val vertex2:Vertex[T]) extends Edge[T] with Weighted with Undirected {

  override def toString: String = vertex1.toString +
    super[Weighted].toString +
    super[Undirected].toString +
    vertex2.toString
}
