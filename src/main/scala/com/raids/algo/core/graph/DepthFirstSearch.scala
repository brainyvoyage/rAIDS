package com.raids.algo.core.graph

import com.raids.ds.core.graph.{Graph, Vertex}

class DepthFirstSearch[T]{
  private[this] def helper(graph: Graph[T], vertex: Vertex[T], discoveryTime: => Int): Unit ={
    require(graph.contains(vertex))
  }
}
