# git-infosyssolusiterpadu

# Setup Database

```shell
docker run --rm \
  --name=test-db \
  -e MYSQL_DATABASE=test_db \
  -e MYSQL_USER=infosys \
  -e MYSQL_PASSWORD=PNSJkxXvVNDAhePMuExTBuRR \
  -e MYSQL_ROOT_PASSWORD=PNSJkxXvVNDAhePMuExTBuRR \
  -e TZ=Asia/Jakarta \
  -p 6603:3306 \
  -v "$PWD/docker/test-db/conf.d":/etc/mysql/conf.d \
  -v "$PWD/storage/docker/testdb-data":/var/lib/mysql \
  mysql
```

# Login MySQL

```shell
docker exec -it test-db mysql -u infosys -p
```