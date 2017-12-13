package com.raids.algo.core.graph

import com.raids.ds.core.graph.{DirectedGraph, Graph, Vertex}

class DepthFirstSearch[T]{
  private[this] def helper(graph: Graph[T], vertex: Vertex[T], discoveryTime: => Int): Unit ={
    require(graph.contains(vertex))
  }

  def run(graph: Graph[T]):DirectedGraph[T] = ???
}
