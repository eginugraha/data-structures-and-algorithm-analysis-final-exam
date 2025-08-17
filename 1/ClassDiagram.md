---
title: Zoo Management System
---
classDiagram
    ZooManagementSystem ..> Herbivore : creates and uses
    ZooManagementSystem ..> Carnivore : creates and uses
    Animal <|-- Herbivore
    Animal <|-- Carnivore
    
    class ZooManagementSystem {
        +void main(String[] args)$
    }
    
    class Herbivore {
        -String scientificName
        +String getScientificName()
        +void setScientificName(String)
        +void showTrophicCategory()
    }
    
    class Carnivore {
        -String scientificName
        +String getScientificName()
        +void setScientificName(String)
        +void showTrophicCategory()
    }

    class Animal {
        -String name
        +String getName()
        +void setName(String)
        +void showTrophicCategory()*
    }
    
    <<abstract>> Animal
