docker buildx build --platform linux/arm64,linux/amd64 -t pinomaker/mars-game-cms-backend:latest-arm64 -t pinomaker/mars-game-cms-backend:latest-amd64 --file Dockerfile.local .  --push
