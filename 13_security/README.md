### XSS - Cross-site scripting
- https://cheatsheetseries.owasp.org/cheatsheets/Cross_Site_Scripting_Prevention_Cheat_Sheet.html

Web-dev-chat:

```html
<span onmouseover="alert('XSS testing!')">Hello all!</span>

<img onload="alert('I\'m a hacker!')" alt="" src="//upload.wikimedia.org/wikipedia/commons/thumb/c/c4/Backlit_keyboard.jpg/220px-Backlit_keyboard.jpg" decoding="async" width="220" height="124">
```

### Clickjacking
- Example: https://javascript.info/article/clickjacking/clickjacking-visible/
- `Content-Security-Policy`, `X-Frame-Options`

- https://www.netsparker.com/blog/web-security/clickjacking-attack-on-facebook-how-tiny-attribute-save-corporation/
- https://cheatsheetseries.owasp.org/cheatsheets/Clickjacking_Defense_Cheat_Sheet.html
