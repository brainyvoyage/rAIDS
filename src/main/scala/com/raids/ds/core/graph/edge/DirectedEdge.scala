package com.raids.ds.core.graph.edge

class DirectedEdge[T](val vertex1: T, val vertex2: T) extends Edge[T] with Directed with Unweighted{

  override def toString: String = vertex1.toString +
    super[Unweighted].toString +
    super[Directed].toString +
    vertex2.toString
}
