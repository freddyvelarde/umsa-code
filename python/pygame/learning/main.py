import pygame

WIDTH, HEIGHT = 900, 500
WIN = pygame.display.set_mode((WIDTH, HEIGHT))


# title game
pygame.display.set_caption("first amazing game!")

# colors 
WHITE = (255,255,255)

# FPS
FPS = 60

def draw_window():
    WIN.fill((255,255,255))
    pygame.display.update()

def main():
    clock = pygame.time.Clock()
    run  = True
    while run:
        clock.tick(FPS)
        for event in pygame.event.get():
            # to quit the game
            if event.type == pygame.QUIT:
                run = False
        draw_window()

    pygame.quit()
            

if __name__ == "__main__":
    main()

# print(pygame)
