```
docker build -t nginx-example .
```

```
docker run -itd --publish 8080:80 nginx-example
```

```
docker container ls
```

```
docker logs -f CONTAINER_ID
```

```
docker exec -it CONTAINER_ID bash
```