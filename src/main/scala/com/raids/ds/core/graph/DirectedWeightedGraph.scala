package com.raids.ds.core.graph

import com.raids.ds.core.graph.edge.WeightedDirectedEdge

import scala.collection.mutable

class DirectedWeightedGraph[T] extends DirectedGraph[T]{
  val adjList: mutable.Map [
    Vertex[T], mutable.Set[WeightedDirectedEdge[T]]] = mutable.Map[Vertex[T], mutable.Set[WeightedDirectedEdge[T]]]()

}