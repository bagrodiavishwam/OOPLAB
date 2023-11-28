

# find_junctions()- Question 1

## Description

This function identifies the railway junctions in a given railway network graph `g`.

A railway junction is defined as a station that has connections to 4 or more other stations. 

It returns the total count of junction stations in the network.

## Approach

As explained in the code comments:

- Iterate over each station (row in adjacency matrix)
- Count number of stations connected to current station
- Sum of 1s in a row denotes connected stations 
- If connected stations count >= 4, it is a junction
- Return total junction stations count

## Implementation

```c
int find_junctions(Graph* g)
```

### Parameters

- `Graph* g` - Graph representing railway network

### Returns

- Count of junction stations

### Time Complexity

`O(V^2)`

V - Number of stations/vertices

### Space Complexity

`O(1)`

Here is the documentation for the sheldons_tour() function:

# sheldons_tour()- Question 2

## Description
This function checks if a given graph `g` allows a Euler tour as described in the problem statement, based on two conditions:

1. Euler circuit possible if no vertex has odd degree 
2. Euler path possible if exactly 2 vertices have odd degree

It returns true if the tour is possible, false otherwise.

## Problem Statement
Check if the graph allows an Euler tour visiting all edges exactly once and returning to the starting vertex (Euler circuit) or ending on a different vertex (Euler path).

## Implementation
```c
bool sheldons_tour(Graph* g, bool SAME_STATION)  
```

### Parameters
- `Graph* g` - Input graph 
- `SAME_STATION` - True for Euler circuit, False for Euler path

### Returns
True if Euler tour possible, False otherwise

### Method
- Compute degree of each vertex 
- Count vertices with odd degree
- For circuit, count must be 0 
- For path, count must be 2
- Return True or False based on degree parity

### Time Complexity  
`O(V+E)`  
V - Number of vertices
E - Number of edges

### Space Complexity
`O(V)`

# find_impossible_pairs() - Question 3

## Description
This function finds the number of impossible pairs of stations in a railway network graph `g`. 

Two stations A and B form an **impossible pair** if there exists no possible route between them.

It returns the count of impossible pairs.

## Approach
- Compute transitive closure of graph using Warshall's algorithm 
- Transitive closure has 1 for stations with a route between them
- It has 0 for station pairs with no connecting route 
- Count 0s in closure matrix and divide by 2  
- Return count as number of impossible pairs

## Implementation
```c 
int find_impossible_pairs(Graph* g)
```

### Parameters
- `Graph* g` - Graph representing railway network

### Returns 
- Count of impossible pairs 

### Time Complexity
`O(V^3)`  
V - Number of stations

### Space Complexity
`O(V^2)`  

# find_vital_train_tracks()-Question 4

## Description

This function identifies the vital train tracks in a railway network graph `g`, as per the problem statement:

The Ministry of Railways is considering upgrading the train tracks to reduce travel times. However this requires the tracks to undergo maintenance during which trains cannot run on them and need rerouting.  

A track is defined as **vital** if its maintenance can cause some cities to become disconnected (no alternate route exists between those cities without passing through this track).

The function returns the count of such vital tracks. 


## Implementation

```c
int find_vital_train_tracks(Graph* g)
```

### Parameters

- `Graph* g` - Graph representing railway network 

### Returns

- Count of vital train tracks

### Methodology

- Iterate over all edges (u, v)
- Temporarily remove (u, v) 
- Check if v remains reachable from u using DFS
- If unreachable, the edge (u, v) is vital
- Restore the edge and repeat
- Return count of vital tracks  

### Time Complexity
`O(E*(V+E))`  
E - Number of edges

V - Number of vertices

### Space Complexity  
`O(V)` 


# upgrade_railway_stations() - Question 5

## Description

This function attempts to assign one of two upgrades (restaurant/maintenance depot) to stations in a railway graph `g` by modeling it as a graph 2-coloring problem.

It returns an upgrades array with 0 indicating restaurant and 1 indicating maintenance depot assigned to stations. If no valid 2-coloring is possible, it returns `-1`.  

## Approach 

- Check if graph `g` is bipartite since only bipartite graphs can be 2-colored 
- Reduce the upgrades assignment problem to a graph 2-coloring problem
- Use BFS traversal and assign color 1 (restaurant) to starting node
- Attempt to assign second color (maintenance depot) to its unvisited neighbors 
- Check for conflicts - if adjacent nodes get same upgrades, return `-1`
- If successful 2-coloring, return upgrades array  

## Implementation

```c
int* upgrade_railway_stations(Graph* g) 
```

### Returns  

- Upgrades array if 2-coloring succeeds 
- Array with `-1` if conflict arises

### Time Complexity
`O(V+E)`  
E - Number of edges

V - Number of vertices


### Space Complexity  
`O(V)`


# distance()- Question 6

### Description

The `distance()` function implements the Floyd-Warshall algorithm to find the shortest distance between two cities in a graph represented by an adjacency matrix.

Specifically, given:

- A graph `g`
  
- Two city ids `city_x` and `city_y`
  
It returns the shortest distance between those two cities. If no path exists between the cities, it returns `-1`.

```c
int distance(Graph* g, int city_x, int city_y)
```

### Parameters

- `Graph* g` - The graph represented as an adjacency matrix
  
- `int city_x` - ID of the source city
  
- `int city_y` - ID of the destination city
  
### Returns

The shortest distance between `city_x` and `city_y`, or `-1` if no path exists

### Workings:

- Initialize a distance matrix distance[n][n] where n is the number of cities

- Populate distance matrix with values from adjacency matrix

- Set missing edges as infinity using a large value

- Apply Floyd-Warshall algorithm to find all pair shortest paths
  
- Replace infinity values with -1
  
- Return the distance between given cities city_x and city_y
  
### Time Complexity

`O(V^3)` where V is the number of vertices/cities

### Space Complexity

`O(V^2)` to store the distance matrix



# railway_capital()- Question 7

## Description

The `railway_capital()` function implements a modified Floyd-Warshall algorithm to find the capital city of a railway network, based on the criteria that it has the minimum possible sum of distances from every other city.

Specifically, given an undirected connected graph `g` representing the railway network, it returns the ID of a city that minimizes the sum of shortest distances to all other cities.

## Implementation 

```c
int railway_capital(Graph* g) 
```

### Parameters

- `Graph* g` - The connected undirected graph representing the railway network

### Returns 

The ID of the capital city

### Workings

- Initialize distance matrix using Floyd-Warshall to calculate all pair shortest paths
- Initialize array `d[n]` to store sum of distances from each city
- Calculate sum of distances from each city using the distance matrix 
- Find city with minimum sum of distances and return its index as capital

### Time Complexity

`O(V^3)` where V is number of cities/vertices

### Space Complexity

`O(V^2)` to store distance matrix

# maharaja_express() - Question 8

## Description

This function checks if there exists a cycle or tour in the graph `g` that visits every city exactly once, starting and ending at the `source` city. 

This is done by detecting cycles in the graph using Depth First Search (DFS).

It returns true if such a cycle/tour exists, false otherwise.

## Approach 

As explained in the code comments:

- Use DFS traversal to detect cycles in graph
- Mark visited cities to avoid revisiting  
- If an adjacent city is already visited and not the parent city, a cycle exists
- Return true if cycle detected, false otherwise

## Implementation

```c
bool maharaja_express(Graph* g, int source) 
```

### Parameters

- `Graph* g` - Input Graph
- `source` - Source city to start and end cycle  

### Returns

- True if tour possible
- False otherwise

### Time Complexity
`O(V+E)`  
V - Number of vertices 
E - Number of edges

### Space Complexity
`O(V)`  

