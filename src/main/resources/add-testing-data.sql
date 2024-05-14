INSERT INTO T_ITEMS (NAME, PROPERTIES, TYPE)
    VALUES
        ('+5 Dexterity Vest', 20, 'NormalItem'),
        ('Elixir of the Mongoose', 7, 'NormalItem'),
        ('AgedBrie', 10, 'AgedBrie');

INSERT INTO T_USERS (NAME, PROPERTIES)
    VALUES
        ('Doobey', 15),
        ('Hermione', 100);

INSERT INTO T_ORDERS (ID, USER, ITEM)
    VALUES
        (100L, 'Doobey', 'Elixir of the Mongoose'),
        (200L, 'Hermione', '+5 Dexterity Vest');
