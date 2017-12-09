package com.raids.ds.core.graph.edge

class WeightedUndirectedEdge[T](val vertex1:T, val vertex2:T) extends Edge with Weighted with Undirected {

  override def toString: String = vertex1.toString +
    super[Weighted].toString +
    super[Undirected].toString +
    vertex2.toString
}
