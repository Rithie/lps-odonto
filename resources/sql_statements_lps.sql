SELECT (
			SELECT count(*) 
			FROM aula.users 
			WHERE email = 'eu@hot.com' 
			AND password = '123456'
        )as userCount,
        (	SELECT level 
			FROM aula.users 
            WHERE email = 'eu@hot.com' 
            AND password = '123456'
		) as userLevel