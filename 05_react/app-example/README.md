# Simple marketplace

This app consists of both backend and frontend parts. Backend part is written in Java,
frontend uses React.

## Run
To run this app, open directory `app-example` in IDEA as a project.

### Backend

Open `Main.java` class and press the green triangle to launch java application.

### Frontend

Navigate (`cd`) to frontend directory and run command

```bash
npm install
```

This command downloads all required dependencies into `node_modules` directory.

After dependencies are installed, launch frontend application:

```bash
npm run start
```

## How it works

Backend application provides an endpoint `/api/products` which returns a list of products.

Frontend application sends an HTTP GET request to get all products from server and then
displays all products on page. You can track this request in browser's console (Network tab).
