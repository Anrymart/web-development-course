https://hackernoon.com/dont-install-postgres-docker-pull-postgres-bee20e200198

```
docker pull postgres
```

Create volume:

```
mkdir -p $HOME/docker/volumes/postgres
```

Run container:

```
docker run --rm   --name pg-docker -e POSTGRES_PASSWORD=docker -d -p 5432:5432 -v $HOME/docker/volumes/postgres:/var/lib/postgresql/data  postgres
```

Enter inside container:

```
docker exec -it pg-docker bash
```

Launch psql:

```
psql -u postgres
```

Show tables:

```
\dt
```