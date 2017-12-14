package com.raids.ds.core.graph.edge

import com.raids.Data
import com.raids.ds.core.graph.Vertex

class UndirectedEdge[A](d1:A, d2: A) extends Edge[A] with Undirected with Unweighted{
  override val vertex1 = new Vertex(new Data[A](d1))
  override val vertex2 = new Vertex(new Data[A](d1))
  override def toString: String = vertex1.toString +
    super[Unweighted].toString +
    super[Undirected].toString +
    vertex2.toString
}
