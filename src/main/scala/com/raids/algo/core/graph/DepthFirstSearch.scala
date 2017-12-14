package com.raids.algo.core.graph

import scala.language.higherKinds
import com.raids.ds.core.graph.{DirectedGraph, Graph, Vertex}

class DepthFirstSearch[A[B]]{
  private[this] def helper(graph: Graph[A], vertex: Vertex[_], discoveryTime: => Int): Unit = ???

  def run(graph: Graph[A]):DirectedGraph[A] = ???
}
