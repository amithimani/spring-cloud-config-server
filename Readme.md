# Git Config Client and Server

This GitHub project comprises two modules: `git-config-client` and `git-config-server`. These modules work together to provide a simple example of how a client application fetches configuration information from a server, which, in turn, retrieves it from a Git repository.

## Table of Contents

- [Modules](#modules)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Modules

1. `git-config-client`: This module represents the client application. It exposes a single endpoint (`/dbinfo`) to retrieve the name of the database. The database name is fetched from the `git-config-server`.

2. `git-config-server`: This module acts as the server and configuration provider. It connects to a GitHub repository to fetch the database name configuration.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) 8 or higher installed
- Maven for building the project
- GitHub account (for storing configuration)

## Getting Started

Follow these steps to get the project up and running:

1. Clone the repository to your local machine:

   ```bash
   git clone https://github.com/yourusername/git-config-client-server.git
