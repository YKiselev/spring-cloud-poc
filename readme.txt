
password: 123456

to encode password:
curl http://user@8b8737d2-b119-4a8c-aa80-b76de22905af:localhost:8888/encrypt -d 123456

You can share application.properties and application.yml across all apps, but application-*.(properties|yml) doesn't seem working.