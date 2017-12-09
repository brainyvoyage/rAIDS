package com.raids.ds.core.graph.edge

class UndirectedEdge[T](val vertex1:T, val vertex2:T) extends Edge[T] with Undirected with Unweighted{
  override def toString: String = vertex1.toString +
    super[Unweighted].toString +
    super[Undirected].toString +
    vertex2.toString
}
