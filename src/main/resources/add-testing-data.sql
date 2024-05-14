INSERT INTO T_ITEMS (ITEM_NAME, PROPERTIES, TYPE)
    VALUES
        ('+5 Dexterity Vest', 20, 'NormalItem'),
        ('Elixir of the Mongoose', 7, 'NormalItem'),
        ('AgedBrie', 10, 'AgedBrie');

INSERT INTO T_USERS (USER_NAME, PROPERTIES)
    VALUES
        ('Doobey', 15),
        ('Hermione', 100);

INSERT INTO T_ORDERS (ID_ORDER, USER_NAME, ITEM)
    VALUES
        (100, 'Doobey', 'Elixir of the Mongoose'),
        (200, 'Hermione', '+5 Dexterity Vest');
