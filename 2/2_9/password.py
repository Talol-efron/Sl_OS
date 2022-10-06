import secrets
import string

alphabet = string.ascii_letters + string.digits + string.punctuation

def generate_password():
    password = ""
    for i in range(12):
        pw = secrets.choice(alphabet)
        password += pw
    print(password)

for i in range(10):
    generate_password()