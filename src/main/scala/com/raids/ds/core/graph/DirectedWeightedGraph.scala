package com.raids.ds.core.graph

import com.raids.ds.core.graph.edge.WeightedDirectedEdge

import scala.collection.mutable
import scala.language.higherKinds

class DirectedWeightedGraph[A[B]] extends DirectedGraph[A]{
  private val adjList:mutable.Map[
    Vertex[A[_]], mutable.Set[WeightedDirectedEdge[A[_]]]] = mutable.Map[Vertex[A[_]], mutable.Set[WeightedDirectedEdge[A[_]]]
    ]()
}