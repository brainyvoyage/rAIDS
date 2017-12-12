package com.raids.ds.core.graph.edge

class WeightedDirectedEdge[T](val vertex1: T, val vertex2: T) extends Edge[T] with Weighted with Directed{
  override def toString: String = vertex1.toString +
    super[Weighted].toString +
    super[Directed].toString +
    vertex2.toString
}
