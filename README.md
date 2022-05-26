# Behave
The goal of this project is to expose an API/language able to describe the behavior of a game server using tags (composed of [blittable types](https://en.wikipedia.org/wiki/Blittable_types)) and support event listening with multiple intentional limitations:
- all tags are serializables
- must be fully statically analyzable (ability to know when X tag may be modified, and what effect it will have to the rest of the program flow)
- abstract enough for the backend to reinterpret it in a performance optimal way
- arbitrary code execution is possible through remote requests, which can mutate an entity tags during safe points
