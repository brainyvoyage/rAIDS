package com.raids.ds.core.graph.edge

import com.raids.Data
import com.raids.ds.core.graph.Vertex

class WeightedUndirectedEdge[A](d1:A, d2: A) extends Edge[A] with Weighted with Undirected {
  override val vertex1 = new Vertex(new Data[A](d1))
  override val vertex2 = new Vertex(new Data[A](d1))

  override def toString: String = vertex1.toString +
    super[Weighted].toString +
    super[Undirected].toString +
    vertex2.toString


}
