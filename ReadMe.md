# How to start

1. Change configuration in src/main/resources/application.properties accordingly to your database settings
2. Compile & Run
3. Insert SQL into new doctor table:
   ``INSERT INTO doctor (id, name)
      VALUES
      (1, 'William Hartnell'),
      (2, 'Patrick Troughton'),
      (3, 'Jon Pertwee'),
      (4, 'Tom Baker'),
      (5, 'Peter Davison'),
      (6, 'Colin Baker'),
      (7, 'Sylvester McCoy'),
      (8, 'Paul McGann'),
      (9, 'Christopher Eccleston'),
      (10, 'David Tennant'),
      (11, 'Matt Smith'),
      (12, 'Peter Capaldi'),
      (13, 'Jodie Whittaker');``
4. Play around
5. Create new doctor: ``curl -d '{"name":"Who"}' -H "Content-Type: application/json" -X POST http://localhost:8080/doctor``
6. Delete doctor: ``curl -X DELETE http://localhost:8080/doctor/$id``