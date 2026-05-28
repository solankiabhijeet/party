# Moqui Party Component

This repository contains a basic `party` component built for the Moqui framework. It was created as part of beginner assignments to learn about Moqui's entities, screens, forms, and services.

## Features

*   **Entities:** Defines `Party`, `Person`, `PartyGroup`, `ContactMech`, and `PartyContactMech`.
*   **Data:** Includes seed data for enumerations (PartyType, ContactMechType) and demo data for testing.
*   **Screens & Forms:** A simple screen at `/apps/party/Party` containing a form list to find parties and a container-dialog to create new ones.
*   **Services:** Groovy script service exposed via REST API (`/party/person`) to handle user creation.